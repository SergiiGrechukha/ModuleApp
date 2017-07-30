package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1143 {

    @Ignore    private SampleClass1144 sampleClass;

    public SampleClass1143(){
        sampleClass = new SampleClass1144();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}