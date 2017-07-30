package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1984 {

    @Ignore    private SampleClass1985 sampleClass;

    public SampleClass1984(){
        sampleClass = new SampleClass1985();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}