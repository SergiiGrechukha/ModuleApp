package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1466 {

    @Ignore    private SampleClass1467 sampleClass;

    public SampleClass1466(){
        sampleClass = new SampleClass1467();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}