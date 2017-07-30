package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1131 {

    @Ignore    private SampleClass1132 sampleClass;

    public SampleClass1131(){
        sampleClass = new SampleClass1132();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}