package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1495 {

    @Ignore    private SampleClass1496 sampleClass;

    public SampleClass1495(){
        sampleClass = new SampleClass1496();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}