package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass477 {

    @Ignore    private SampleClass478 sampleClass;

    public SampleClass477(){
        sampleClass = new SampleClass478();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}