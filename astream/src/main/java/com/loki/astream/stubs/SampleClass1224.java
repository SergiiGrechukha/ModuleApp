package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1224 {

    @Ignore    private SampleClass1225 sampleClass;

    public SampleClass1224(){
        sampleClass = new SampleClass1225();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}