package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1148 {

    @Ignore    private SampleClass1149 sampleClass;

    public SampleClass1148(){
        sampleClass = new SampleClass1149();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}