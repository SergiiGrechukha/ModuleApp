package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass642 {

    @Ignore    private SampleClass643 sampleClass;

    public SampleClass642(){
        sampleClass = new SampleClass643();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}