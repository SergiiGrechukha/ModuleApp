package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass952 {

    @Ignore    private SampleClass953 sampleClass;

    public SampleClass952(){
        sampleClass = new SampleClass953();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}