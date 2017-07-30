package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1225 {

    @Ignore    private SampleClass1226 sampleClass;

    public SampleClass1225(){
        sampleClass = new SampleClass1226();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}