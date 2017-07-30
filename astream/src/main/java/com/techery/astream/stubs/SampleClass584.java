package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass584 {

    @Ignore    private SampleClass585 sampleClass;

    public SampleClass584(){
        sampleClass = new SampleClass585();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}