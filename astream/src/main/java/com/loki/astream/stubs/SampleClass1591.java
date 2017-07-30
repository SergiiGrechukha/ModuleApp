package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1591 {

    @Ignore    private SampleClass1592 sampleClass;

    public SampleClass1591(){
        sampleClass = new SampleClass1592();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}