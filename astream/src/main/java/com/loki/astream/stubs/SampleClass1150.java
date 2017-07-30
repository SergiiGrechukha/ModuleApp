package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1150 {

    @Ignore    private SampleClass1151 sampleClass;

    public SampleClass1150(){
        sampleClass = new SampleClass1151();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}