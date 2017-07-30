package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1711 {

    @Ignore    private SampleClass1712 sampleClass;

    public SampleClass1711(){
        sampleClass = new SampleClass1712();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}