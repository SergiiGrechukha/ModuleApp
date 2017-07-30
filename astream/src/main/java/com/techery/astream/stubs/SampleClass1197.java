package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1197 {

    @Ignore    private SampleClass1198 sampleClass;

    public SampleClass1197(){
        sampleClass = new SampleClass1198();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}