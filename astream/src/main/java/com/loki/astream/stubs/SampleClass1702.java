package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1702 {

    @Ignore    private SampleClass1703 sampleClass;

    public SampleClass1702(){
        sampleClass = new SampleClass1703();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}