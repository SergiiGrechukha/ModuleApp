package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1070 {

    @Ignore    private SampleClass1071 sampleClass;

    public SampleClass1070(){
        sampleClass = new SampleClass1071();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}