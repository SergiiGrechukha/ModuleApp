package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass876 {

    @Ignore    private SampleClass877 sampleClass;

    public SampleClass876(){
        sampleClass = new SampleClass877();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}