package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1682 {

    @Ignore    private SampleClass1683 sampleClass;

    public SampleClass1682(){
        sampleClass = new SampleClass1683();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}