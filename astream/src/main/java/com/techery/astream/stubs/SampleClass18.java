package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass18 {

    @Ignore    private SampleClass19 sampleClass;

    public SampleClass18(){
        sampleClass = new SampleClass19();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}