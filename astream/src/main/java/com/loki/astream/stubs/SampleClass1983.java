package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1983 {

    @Ignore    private SampleClass1984 sampleClass;

    public SampleClass1983(){
        sampleClass = new SampleClass1984();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}