package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1788 {

    @Ignore    private SampleClass1789 sampleClass;

    public SampleClass1788(){
        sampleClass = new SampleClass1789();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}