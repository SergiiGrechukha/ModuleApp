package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1657 {

    @Ignore    private SampleClass1658 sampleClass;

    public SampleClass1657(){
        sampleClass = new SampleClass1658();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}