package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1793 {

    @Ignore    private SampleClass1794 sampleClass;

    public SampleClass1793(){
        sampleClass = new SampleClass1794();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}