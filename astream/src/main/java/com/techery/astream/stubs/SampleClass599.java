package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass599 {

    @Ignore    private SampleClass600 sampleClass;

    public SampleClass599(){
        sampleClass = new SampleClass600();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}