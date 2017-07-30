package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1171 {

    @Ignore    private SampleClass1172 sampleClass;

    public SampleClass1171(){
        sampleClass = new SampleClass1172();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}