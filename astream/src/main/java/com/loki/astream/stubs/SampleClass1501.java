package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1501 {

    @Ignore    private SampleClass1502 sampleClass;

    public SampleClass1501(){
        sampleClass = new SampleClass1502();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}