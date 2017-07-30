package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1365 {

    @Ignore    private SampleClass1366 sampleClass;

    public SampleClass1365(){
        sampleClass = new SampleClass1366();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}