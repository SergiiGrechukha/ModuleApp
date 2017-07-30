package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1060 {

    @Ignore    private SampleClass1061 sampleClass;

    public SampleClass1060(){
        sampleClass = new SampleClass1061();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}