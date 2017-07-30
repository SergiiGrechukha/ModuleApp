package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass668 {

    @Ignore    private SampleClass669 sampleClass;

    public SampleClass668(){
        sampleClass = new SampleClass669();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}