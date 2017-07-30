package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1741 {

    @Ignore    private SampleClass1742 sampleClass;

    public SampleClass1741(){
        sampleClass = new SampleClass1742();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}