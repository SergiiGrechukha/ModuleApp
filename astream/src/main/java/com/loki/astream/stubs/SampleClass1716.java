package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1716 {

    @Ignore    private SampleClass1717 sampleClass;

    public SampleClass1716(){
        sampleClass = new SampleClass1717();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}