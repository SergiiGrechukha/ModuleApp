package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass37 {

    @Ignore    private SampleClass38 sampleClass;

    public SampleClass37(){
        sampleClass = new SampleClass38();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}