package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1245 {

    @Ignore    private SampleClass1246 sampleClass;

    public SampleClass1245(){
        sampleClass = new SampleClass1246();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}