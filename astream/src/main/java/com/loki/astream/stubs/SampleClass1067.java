package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1067 {

    @Ignore    private SampleClass1068 sampleClass;

    public SampleClass1067(){
        sampleClass = new SampleClass1068();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}