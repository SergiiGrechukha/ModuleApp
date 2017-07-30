package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1520 {

    @Ignore    private SampleClass1521 sampleClass;

    public SampleClass1520(){
        sampleClass = new SampleClass1521();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}