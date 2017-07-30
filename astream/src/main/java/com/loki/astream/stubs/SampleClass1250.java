package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1250 {

    @Ignore    private SampleClass1251 sampleClass;

    public SampleClass1250(){
        sampleClass = new SampleClass1251();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}