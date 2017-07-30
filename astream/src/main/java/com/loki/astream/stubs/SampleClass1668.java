package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1668 {

    @Ignore    private SampleClass1669 sampleClass;

    public SampleClass1668(){
        sampleClass = new SampleClass1669();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}