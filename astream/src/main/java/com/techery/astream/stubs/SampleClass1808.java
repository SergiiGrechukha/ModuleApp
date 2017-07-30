package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1808 {

    @Ignore    private SampleClass1809 sampleClass;

    public SampleClass1808(){
        sampleClass = new SampleClass1809();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}