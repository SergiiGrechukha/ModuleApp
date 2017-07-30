package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1118 {

    @Ignore    private SampleClass1119 sampleClass;

    public SampleClass1118(){
        sampleClass = new SampleClass1119();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}