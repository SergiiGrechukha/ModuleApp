package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1102 {

    @Ignore    private SampleClass1103 sampleClass;

    public SampleClass1102(){
        sampleClass = new SampleClass1103();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}