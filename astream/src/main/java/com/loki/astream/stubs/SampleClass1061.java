package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1061 {

    @Ignore    private SampleClass1062 sampleClass;

    public SampleClass1061(){
        sampleClass = new SampleClass1062();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}